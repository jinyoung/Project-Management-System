<template>
    <v-card outlined>
        <v-card-title>
            SetInspectionStagesCommand
        </v-card-title>

        <v-card-text>
            <InspectionStageList offline label="InspectionStages" v-model="value.inspectionStages" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="setInspectionStagesCommand"
            >
                SetInspectionStagesCommand
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
        name: 'SetInspectionStagesCommandCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.inspectionStages = [];
        },
        watch: {
        },
        methods: {
            setInspectionStagesCommand() {
                this.$emit('setInspectionStagesCommand', this.value);
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

