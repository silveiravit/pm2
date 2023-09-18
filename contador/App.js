import { Component } from 'react';
import { StyleSheet, Text, View, Button } from 'react-native';

export default class App extends Component{

  constructor(){
    super()
    this.state = {
      contador: 0
    }
    this.incrementar = this.incrementar.bind(this)
    this.decrementar = this.decrementar.bind(this)
  }

  incrementar(){
    this.setState({
      contador: this.state.contador + 1
    })
  }

  decrementar(){
    this.setState({
      contador: this.state.contador - 1
    })
  }

  render(){
    return(
      <View style={styles.container}>

        <Text style={styles.contador}>{this.state.contador}</Text>

        <View style={styles.view2}>
          <Button 
            title='AUMENTAR'
            style={styles.btn}
            onPress={this.incrementar}
          />

          <Button 
            title='DIMINUIR'
            style={styles.btn}
            onPress={this.decrementar}
          />
        </View>

      </View>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  view2: {
    flexDirection: 'row'
  },
  btn: {
    margin: 10
  },
  contador: {
    fontSize: 30,
    marginBottom: 30
  }
});
