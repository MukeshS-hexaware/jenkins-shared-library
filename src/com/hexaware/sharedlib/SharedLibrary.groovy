package com.hexaware.sharedlib;

public class SharedLibrary {
  def pipeline
  
  public SharedLibrary(pipeline) {
    this.pipeline = pipeline
  }
  
  public void startBuild() {
    pipeline.steps.sh "echo 'Hello, World!'"
  }
}
