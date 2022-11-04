import React from 'react';
import { Button } from '../Button';
import {
  BuscarInputContainer,
  Container,
  Input,
  Menu,
  MenuRight,
  Row,
  Wrapper,
} from "./styles";
const Header = () => {
  return (
      <Wrapper>
        <Container>
          <Row>
            <BuscarInputContainer>
              <Input placeholder='Buscar...' />
            </BuscarInputContainer>
            <Menu>Live Code</Menu>
            <Menu>Global</Menu>
          </Row>
          <Row>
            <MenuRight href="#">Menu</MenuRight>
            <Button title="Entrar" />
            <Button title="Cadastrar" />
          </Row>
        </Container>
      </Wrapper>
    
  );
};

export { Header };
