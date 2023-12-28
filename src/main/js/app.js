const React = require('react'); 
const ReactDOM = require('react-dom'); 
const client = require('./client'); 

class App extends React.Component { 

	constructor(props) {
		super(props);
		this.state = {products: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/products'}).done(response => {
			this.setState({products: response.entity._embedded.products});
		});
	}

	render() { (3)
		return (
			<ProductsList products={this.state.products}/>
		)
	}
}

class ProductsList extends React.Component{
	render() {
		const products = this.props.products.map(products =>
			<Products key={products._links.self.href} products={products}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Nome Produto</th>
						<th>Descrição</th>
						<th>Preço unita</th>
					</tr>
					{products}
				</tbody>
			</table>
		)
	}
}

class Products extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.products.nomeProduto}</td>
				<td>{this.props.products.descProduto}</td>
				<td>R$ {this.props.products.precoProduto.toFixed(2)}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)