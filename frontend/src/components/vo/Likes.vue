<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            {{label}}
        </v-card-title>
        <v-card-text v-if="value">
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Address" v-model="value.address"/>
            </div>
            <div v-else>
                Address :  {{value.address }}
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Subject" v-model="value.subject"/>
            </div>
            <div v-else>
                Subject :  {{value.subject }}
            </div>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-text-field label="Content" v-model="value.content"/>
            </div>
            <div v-else>
                Content :  {{value.content }}
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name:"Email",
        props: {
            editMode: Boolean,
            value : Object,
            label : String,
        },
        created(){
            if(!this.value) {
                this.value = {
                    'address': '',
                    'subject': '',
                    'content': '',
                };
            }
        },
        watch: {
            value(newVal) {
                this.$emit('input', newVal);
            },
        },
    }
</script>

<style scoped>
    .address-v-card-title {
        display: contents;
    }
    .address-v-text-field {
        margin-top:5px;
    }
</style>
