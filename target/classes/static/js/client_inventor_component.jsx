var SaveInventorComponent = React.createClass( {

    getInitialState: function() {
        return { clientLastName: '', inventorName: '', weight: '', sector: '', date: '' };
    },

    handleClientLastNameNameChange: function( event ) {
        this.setState( { clientLastName: event.target.value } )
    },
    handleInventorNameChange: function( event ) {
        this.setState( { inventorName: event.target.value } )
    },

    handleWeightChange: function( event ) {
        this.setState( { weight: event.target.value } )
    },

    handleSectorChange: function( event ) {
        this.setState( { sector: event.target.value } )
    },

    handleDateChange: function( event ) {
        this.setState( { date: event.target.value } )
    },

 


    registerInventorClient: function() {
        axios.post( 'http://localhost:8080/api/clients/create', {
            clientLastName: this.state.clientLastName,
            inventorName: this.state.inventorName,
            weight: this.state.weight,
            sector: this.state.sector,
            date: this.state.date
        } ).then( result => window.location = "#/" );
    },

    render() {
        return (
            <div>
                <form>
                    <fieldset>
                        <legend>Register a inventor</legend>
                        <div className="form-group">
                        <label htmlFor="clientLastName">Client last name</label>
                        <input  className="form-control" id="clientLastName" name="clientLastName" value={this.props.clientLastName} onChange={this.handleClientLastNameChange} />
                    </div>
                        <div className="form-group">
                            <label htmlFor="inventorName">Inventor Name</label>
                            <input className="form-control" id="inventorName" name="inventorName" value={this.props.inventorName} onChange={this.handleInventorNameChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="weight">Inventor weight</label>
                            <input className="form-control" id="weight" name="weight" value={this.props.weight} onChange={this.handleWeightChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="sector">Sector</label>
                            <input type="number" min="1" max="5" className="form-control" id="sector" name="sector" value={this.props.sector} onChange={this.handleSectorChange} />
                        </div>
                        <div className="form-group">
                            <label htmlFor="date">Date</label>
                            <input type="date" className="form-control" id="date" name="date" value={this.props.date} onChange={this.handleDateChange} />
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

window.SaveInventorComponent = SaveInventorComponent;