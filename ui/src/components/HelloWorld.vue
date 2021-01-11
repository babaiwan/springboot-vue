<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>点击我从后台获取数据</h2>
    <el-button type="primary" @click="helloWorld()">Element-UI</el-button>
  </div>
</template>

<script>
import {getHelloWorldMessage} from "../api/api";
import axios from "axios";

export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods:{
    helloWorld(){
      let data={
        'message':'here we go!!!'
      }
      getHelloWorldMessage(data).then(json=>{
        console.log(json)
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
