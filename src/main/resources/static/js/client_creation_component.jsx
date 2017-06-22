var ClientCreationComponent = React.createClass( {

    getInitialState: function() {
        return { firstName: '', lastName: '', bornDate: '', phone: '', isLoyal: '' };
    },

    handleFirstNameChange: function( event ) {
        this.setState( { firstName: event.target.value } )
    },

    handleornDateChange: function( event ) {
        this.setState( { lastName: event.target.value } )
    },

    handleBornDateChange: function( event ) {
        this.setState( { bornDate: event.target.value } )
    },

    handlePhoneChange: function( event ) {
        this.setState( { phone: event.target.value } )
    },

    handleIsLoyalChange: function( event ) {
        this.setState( { isLoyal: event.target.value } )
    },


    registerClient: function() {
        axios.post( 'http://localhost:8080/api/clients/create', {
            firstName: this.state.firstName,
            lastName: this.state.lastName,
            bornDate: this.state.bornDate,
            phone: this.state.phone,
            isLoyal: this.state.isLoyal
        } ).then( result => window.location = "#/" );
    },

    render() {
        return (
            <div>
                <form>
                    <fieldset>
                        <legend>Register a client</legend>
                        <div className="form-group">
                            <label htmlFor="firstName">First Name</label>
                            <input className="form-control" id="firstName" name="firstName" value={this.props.firstName} onChange={this.handleFirstNameChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="lastName">Last Name</label>
                            <input className="form-control" id="lastName" name="lastName" value={this.props.lastName} onChange={this.handleLastNameChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="bornDate">Born Date</label>
                            <input type="date" className="form-control" id="bornDate" name="bornDate" value={this.props.bornDate} onChange={this.handleBornDateChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="phone">Phone</label>
                            <input type="number" className="form-control" id="phone" name="phone" value={this.props.phone} onChange={this.handlePhoneChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="isLoyal">Is Loyal</label>
                            <input type="checkbox" className="form-control" id="isLoyal" name="isLoyal" value={this.props.isLoyal} onChange={this.handleIsLoyalChange} />
                        </div>

                        <div className="form-group">
                            <input className="btn btn-primary" id="registerBtn" type="button" value="Register" onClick={this.registerClient} />
                        </div>
                    </fieldset>
                </form>
            </div>
        )
    }

} );

window.ClientCreationComponent = ClientCreationComponent;