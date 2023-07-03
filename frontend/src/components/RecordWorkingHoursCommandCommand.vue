<template>
    <v-card outlined>
        <v-card-title>
            RecordWorkingHoursCommand
        </v-card-title>

        <v-card-text>
            <Number label="WorkingHours" v-model="value.workingHours" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="recordWorkingHoursCommand"
            >
                RecordWorkingHoursCommand
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
        name: 'RecordWorkingHoursCommandCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.workingHours = {};
        },
        watch: {
        },
        methods: {
            recordWorkingHoursCommand() {
                this.$emit('recordWorkingHoursCommand', this.value);
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

