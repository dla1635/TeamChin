<template>
  <v-app>
    <router-view/>
  </v-app>
</template>

<script>

export default {
  name: 'App',
  data: () => ({
    //
  }),
};
</script>

<style>
@import url('https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900|Roboto&display=swap');

#app {
  font-family: 'Noto Sans KR', sans-serif;
  /* font-size: 15px; */
  background-color: #FFFFFF;
}
</style>
