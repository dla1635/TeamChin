<template>
  <v-container fluid>
    <v-app-bar app flat absolute scroll-target="#scrolling">
      <v-icon class="back_icon" @click="goToprevious()">keyboard_backspace</v-icon>
      <v-layout offset-xs-1 font-weight-bold class="appbar_title">
        {{postTypeName}}
        </v-layout>
    </v-app-bar>

    <v-content style="padding-top: 44px">
      <v-divider></v-divider>
      <v-sheet id="scrolling" class="overflow-y-auto" max-height="600">
        <router-view></router-view>
      </v-sheet>
    </v-content>

    <!-- <v-layout row align-center xs12 sm12 class="top_menu_container">
      <v-icon offset-xs-1 offset-sm-1 class="outside_icon" @click="goToprevious()">arrow_back</v-icon>
      <v-flex offset-xs-5 offset-sm-5 xs2 sm2>{{postTypeName}}</v-flex>
    </v-layout>
    <v-divider></v-divider>
    <router-view></router-view>-->
  </v-container>
</template>


<script>
import { mapGetters } from "vuex";

export default {
  name: "default",
  data() {
    return {};
  },
  methods: {
    goToprevious() {
      this.$router.go(-1);
    }
  },
  computed: {
    ...mapGetters({
      postTypeName: "getPostTypeName"
    })
  }
};
</script>

<style scoped>
.back_icon {
  color: #000000;
}

.appbar_title {
  justify-content: center;
  padding-right: 20px;
}

.container {
  background-color: #ffffff;
}

.top_menu_container {
  margin: 10px 0px;
}

.outside_icon {
  margin: 0px 10px;
}
</style>