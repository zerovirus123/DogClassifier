# Overview

Real time dog breed classification using transfer learning from a pre-trained MobileNet convolutional neural network model.  

# What is transfer learning?

Transfer learning is a machine learning method where a model developed for a task is reused as the starting point for a model on a second task.

Deep learning models often take days or weeks to train, even on modern hardware. Therefore, if a pre-trained model can be reused for similar tasks, it would save developers a lot of time.

Below are the steps for using a pre-trained model for transfer learning.

1.) **Select Source Model**. A pre-trained source model is chosen from available models. Many research institutions release models on large and challenging datasets that may be included in the pool of candidate models from which to choose from.

2.) **Reuse Model**. The model pre-trained model can then be used as the starting point for a model on the second task of interest. This may involve using all or parts of the model, depending on the modeling technique used.

3.) **Tune Model**. Optionally, the model may need to be adapted or refined on the input-output pair data available for the task of interest.

# Collecting the data

Dog images are downloaded from using Google Images Download, a Python image scraping script that downloads images based on keywords. More information can be found on https://github.com/hardikvasa/google-images-download.

Sometimes, datasets irrevelant to the problem will be downloaded. For example, the keyword 'boxer' may return images of the combat sport instead of the dog breed. It is important to filter out these datas.

For this project, 50 dog breeds are used for this classification tasks. 

# Training the data

A pre-trained MobileNet_1_224 model is used to train the final layer. The first number refers to the relative size of model compared to the largest MobileNet(1, 0.75, 0.5, 0.25). The second number refers to the input image resolution (128, 160, 192, 224). This configuration produces the most accurate model, but also takes the longest to train. 

Scripts for re-training the final layer can be found at https://codelabs.developers.google.com/codelabs/tensorflow-for-poets/#0. The link provides a guide to retraining TensorFlow models.

# Fine tuning training parameters

Tweaking the parameters can often squeeze in a few more percent to the final accuracy. Some examples of the parameters include learning rate, regularization, mini-batch size and more. 

For this project, different learning rate is being used to train the model. A learning rate of 0.05 yields the optimal accuracy. Decreasing the learning rate would only prolong the training time, or even cause the gradient descent to fail to converge.

# Final Result

The final test accuracy for 4000 iterations is about 74.6%.

<img width="564" alt="screen shot 2019-01-08 at 2 41 35 pm" src="https://user-images.githubusercontent.com/9401015/50814878-19a6fc80-1356-11e9-8eb9-e1f55e46179e.png">


# Testing the product

Most dog breeds within the trained categories can be classified correctly. However, some breeds are constantly misclassified, such as the bull terrier.

