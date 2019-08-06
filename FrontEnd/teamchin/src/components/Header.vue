<template>
    <div id="header">
        <v-toolbar>
            <v-btn icon >
              <v-icon>arrow_back</v-icon>
            </v-btn>
            <v-spacer></v-spacer>
            <v-toolbar-title>Title</v-toolbar-title>
            <v-spacer></v-spacer>

            <v-btn icon @click="" >
              <v-icon>add_circle_outline</v-icon>
            </v-btn>
          </v-toolbar>
    </div>
</template>


<script>
export default {
    name:"header",
    methods: {
        createTeam
    }
}
</script>

<style>
 #header{
     margin-bottom: 15px;
 }
</style>
