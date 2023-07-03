<template>
    <v-card outlined>
        <v-card-title>
            SetPaymentDueDateCommand
        </v-card-title>

        <v-card-text>
            <Date label="PaymentDueDates" v-model="value.paymentDueDates" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="setPaymentDueDateCommand"
            >
                SetPaymentDueDateCommand
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
        name: 'SetPaymentDueDateCommandCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.paymentDueDates = {};
        },
        watch: {
        },
        methods: {
            setPaymentDueDateCommand() {
                this.$emit('setPaymentDueDateCommand', this.value);
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

