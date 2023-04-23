import React, {useState} from 'react';
import {
  Button,
  NativeModules,
  SafeAreaView,
  StyleSheet,
  Text,
} from 'react-native';
const {HelloPT} = NativeModules;

const App = () => {
  const Change = () => {
    HelloPT.sayHello('Yeh!! its a Toast Message', 100);
  };

  return (
    <>
      <Text>Hii</Text>
      <SafeAreaView>
        <Button onPress={Change} title="call native function" />
      </SafeAreaView>
    </>
  );
};

export default App;
const styles = StyleSheet.create({
  f1: {flex: 1},
  helloWorldTextStyle: {
    fontFamily: 'Arial',
    fontSize: 30,
    color: '#ffffff',
    textAlignVertical: 'center',
    textAlign: 'center',
  },
});
