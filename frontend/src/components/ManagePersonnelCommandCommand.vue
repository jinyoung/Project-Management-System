<template>
    <v-card outlined>
        <v-card-title>
            ManagePersonnelCommand
        </v-card-title>

        <v-card-text>
            <int offline label="Personnel" v-model="value.personnel" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="managePersonnelCommand"
            >
                ManagePersonnelCommand
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ManagePersonnelCommandCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.personnel = {};
        },
        watch: {
        },
        methods: {
            managePersonnelCommand() {
                this.$emit('managePersonnelCommand', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

