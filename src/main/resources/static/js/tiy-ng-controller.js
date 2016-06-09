angular.module('TIYAngularApp', [])
   .controller('SampleController', function($scope, $http, $timeout) {
  $scope.makeChocolate = function() {

                                                  console.log("About to add the following chocolate!" + JSON.stringify($scope.newChocolate));

                                                  $http.post("/makeChocolate.json", $scope.newChocolate)
                                                      .then(
                                                          function successCallback(response) {
                                                              console.log(response.data);
                                                              console.log("Adding data to scope");
                                                              $scope.madeChocolate = response.data;
                                                              $scope.processSolutionSmall();
                                                               $scope.processSolution();


                                                          },
                                                          function errorCallback(response) {
                                                              console.log("Unable to get data");
                                                          });
                                              };

                                              $scope.makeArray = function(arraySize) {
                                                          var returnArray = [];
                                                          for (var i = 0; i < arraySize; i++) {
                                                              returnArray.push(i);
                                                          }
                                                          return returnArray;
                                                      }

                                                      $scope.processSolutionSmalls = function() {
                                                                  console.log("processSolutionSmalls ...");
                                                                  if ($scope.tempSolution.smalls <= 0) {
                                                                      console.log("Done processing solution!");
                                                                      return;
                                                                  }
                                                                  $scope.tempSolution.smalls--;
                                                                  $scope.newChocolate.smalls--;
                                                                  $scope.chocolateSolution.smalls++;
//                                                                  $timeout($scope.processSolutionSmalls, 1000);
                                                              }


                           $scope.processSolutionBigs = function() {
                                                  console.log("processSolutionBigs ...");
                                                  if ($scope.tempSolution.bigs <= 0) {
                                                      console.log("Done processing solution!");
                                                                   return;
                                                                 }
                                                     $scope.tempSolution.bigs--;
                                                     $scope.newChocolate.bigs--;
                                                     $scope.chocolateSolution.bigs++;
//                                                     $timeout($scope.processSolutionBigs, 1000);
                                                             }

                          $scope.processSolution = function(){
                          console.log("processSolution")
                          $scope.newChocolate.bigBars = $scope.newChocolate.bigBars - $scope.madeChocolate.bigs;
                          }

                          $scope.processSolutionSmall = function(){
                                                    console.log("processSolution")
                                                    $scope.newChocolate.smallBars = $scope.newChocolate.smallBars - $scope.madeChocolate.smalls;
                                                    }





    });