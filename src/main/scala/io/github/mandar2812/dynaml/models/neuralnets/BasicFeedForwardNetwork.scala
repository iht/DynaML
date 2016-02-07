package io.github.mandar2812.dynaml.models.neuralnets

import breeze.linalg.DenseVector
import com.tinkerpop.frames.FramedGraphFactory

/**
 * Represents the template of a Feed Forward Neural Network
 * backed by an underlying graph.
 */
abstract class BasicFeedForwardNetwork[D](data: D, netgraph: FFNeuralGraph)
  extends NeuralNetwork[D, FFNeuralGraph]{

  override protected val g = data

  override protected var params = netgraph

  val feedForward = params.forwardPass _

  /**
   * Get the value of the parameters
   * of the model.
   **/
  override val outputDimensions: Int = params.num_outputs
  override val hiddenLayers: Int = params.hidden_layers
  override val activations: List[(Double) => Double] = params.activations.map(TransferFunctions.getActivation)
  override val neuronCounts: List[Int] = List.tabulate[Int](hiddenLayers)(i => params.getLayer(i+1).size)
  override val inputDimensions: Int = params.num_inputs

  override def initParams(): FFNeuralGraph = FFNeuralGraph(
    inputDimensions, outputDimensions,
    hiddenLayers, params.activations,
    neuronCounts)

  /**
   * Learn the parameters
   * of the model which
   * are in a node of the
   * graph.
   *
   **/
  override def learn(): Unit = {}
}

object BasicFeedForwardNetwork {

  val manager: FramedGraphFactory = new FramedGraphFactory


}