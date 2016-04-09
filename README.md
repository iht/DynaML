# DynaML 

[![Join the chat at https://gitter.im/mandar2812/DynaML](https://badges.gitter.im/mandar2812/DynaML.svg)](https://gitter.im/mandar2812/DynaML?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge) [![Build Status](https://travis-ci.org/mandar2812/DynaML.svg?branch=master)](https://travis-ci.org/mandar2812/DynaML)

Aim
============

DynaML is a scala library/repl for implementing and working with general Machine Learning models. Machine Learning/AI applications make heavy use of various entities such as graphs, vectors, matrices etc as well as classes of mathematical models which deal with broadly three kinds of tasks, prediction, classification and clustering.

The aim is to build a robust set of abstract classes and interfaces, which can be extended easily to implement advanced models for small and large scale applications.

But the library can also be used as an educational/research tool for data analysis. 

Currently DynaML supports.
* Regularized Ordinary Least Squares
* Logistic and Probit Models for binary classification
* Regression and Classification with kernel based Dual LS-SVM
* Regression and Classification with Gaussian Processes
* Feed forward Neural Networks
* Committee Models
  - Neural Committee Models
  - Gaussian Process Committee Models
* Model Learning and Optimization
  - Gradient Descent
  - Conjugate Gradient
  - Committee Model Solver
  - Back propogation with momentum
  - LSSVM linear solver
* Model tuning
  * Grid Search
  * Maximum Likelihood (ML-II)
  * Coupled Simulated Annealing
* Model validation metrics (RMSE, Area under ROC)
* Entropy based data subset selection
* Data Pipes for configurable workflows


Installation
============
 
Platform Compatibility
----------------------
Currently DynaML installs and runs on *nix platforms, though it is possible to build the project on windows, running the generated .bat file might not work and one would need to resort to using the `java -jar` command.

Pre-requisites
-------------
* Apache Maven
* A modern HTML5 enabled browser (to view plots generated by Wisp)
* BLAS, LAPACK and ARPACK binaries for your platform. In case they are not installed, it is possible to disable this feature by commenting out (`<!-- -->`) the section of the pom.xml file given below.
  
  ```xml
    <dependency>
      <groupId>org.scalanlp</groupId>
      <artifactId>breeze-natives_2.10</artifactId>
      <version>0.10</version>
    </dependency>
  ```

Steps
-------

* Clone this repository
* Run the following.
```shell
  mvn clean compile
  mvn package
```

* Make sure you give execution permission to `DynaML` in the `target/bin` directory.
```shell
  chmod +x target/bin/DynaML
  target/bin/DynaML
```
  You should get the following prompt.
  
```
    ___       ___       ___       ___       ___       ___   
   /\  \     /\__\     /\__\     /\  \     /\__\     /\__\  
  /::\  \   |::L__L   /:| _|_   /::\  \   /::L_L_   /:/  /  
 /:/\:\__\  |:::\__\ /::|/\__\ /::\:\__\ /:/L:\__\ /:/__/   
 \:\/:/  /  /:;;/__/ \/|::/  / \/\::/  / \/_/:/  / \:\  \   
  \::/  /   \/__/      |:/  /    /:/  /    /:/  /   \:\__\  
   \/__/               \/__/     \/__/     \/__/     \/__/  

Welcome to DynaML v 1.2
Interactive Scala shell

DynaML>
```

Getting Started
===============
Refer to the DynaML [wiki](https://github.com/mandar2812/DynaML/wiki) to learn more.
