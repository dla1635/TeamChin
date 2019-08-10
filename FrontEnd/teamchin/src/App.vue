<template>
  <v-app>
    <router-view/>
  </v-app>
</template>

<script>
import Header from '@/components/Header'

export default {
  name: 'App',
  data: () => ({
    //
  }),
  components: {
    Header
  }
};
</script>
