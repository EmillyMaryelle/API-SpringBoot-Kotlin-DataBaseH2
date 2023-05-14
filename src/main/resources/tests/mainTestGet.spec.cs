describe('Testando o metodo get', () => {

    beforeEach(() => {
      cy.visit('/api/get')
    })
  
    it('Json de get', () => {
      cy.get('./api/get').should('have.length', 3)
    })
  
    it('json do generate', () => {
      cy.get('#data').type(' ')
      cy.get('#valor').type('')
      cy.get('#idVendedor').type('')
      cy.get('#vendedorNome').type('')
      cy.contains('Salvar').click()
      cy.get('./api/get').should('have.length', 4)
    })
  
  })
  