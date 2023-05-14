describe('Testando o metodo Generate', () => {

    beforeEach(() => {
      cy.request('POST', 'http://localhost:8080/api/generate', {
        data: '2010/05/02',
        valor: 0.01,
        idVendedor: 0,
        vendedorNome: 'Emilly'
      }).as('only')
    })
  
    it(' ', () => {
      cy.get('@only').then((response) => {
        expect(response.status).to.eq(201)
        expect(response.body).to.have.property('id')
        expect(response.body.data).to.eq('2010/05/02')
        expect(response.body.valor).to.eq(0.01)
        expect(response.body.idVendedor).to.eq(1)
        expect(response.body.vendedorNome).to.eq('Emilly')
      })
    })
  
  })
  