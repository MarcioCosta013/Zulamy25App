# Zulamy25App

Zulamy25App é um aplicativo Android interativo que apresenta uma grade de 25 botões numerados. Ao selecionar um botão, o usuário é direcionado para uma tela de detalhes que exibe uma imagem e um texto correspondentes ao número escolhido. O aplicativo também reproduz uma música de fundo contínua enquanto está em uso.

## Índice

- [Recursos](#recursos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Recursos

- **Interface Intuitiva**: Uma grade de 5x5 botões numerados para fácil navegação.
- **Tela de Detalhes**: Cada botão leva a uma tela com uma imagem e texto específicos.
- **Música de Fundo**: Reprodução contínua de música enquanto o aplicativo está ativo.

## Instalação

1. **Clone o Repositório**:

   ```bash
   git clone https://github.com/MarcioCosta013/Zulamy25App.git
   cd Zulamy25App
   ```

2. **Importe o Projeto no Android Studio**:

   - Abra o Android Studio.
   - Selecione "Open an existing project" e escolha o diretório clonado.

3. **Compile e Execute o Aplicativo**:

   - Conecte um dispositivo Android ou use um emulador.
   - Clique em "Run" para instalar e iniciar o aplicativo.

## Uso

1. **Navegação Principal**:
   - Ao iniciar o aplicativo, uma grade de 25 botões numerados é exibida.

2. **Interação com os Botões**:
   - Toque em qualquer botão para ser direcionado à tela de detalhes correspondente.

3. **Tela de Detalhes**:
   - Exibe uma imagem e um texto relacionados ao número do botão selecionado.
   - Use o botão "Voltar" do dispositivo para retornar à tela principal.

4. **Música de Fundo**:
   - A música inicia automaticamente ao abrir o aplicativo e para quando todas as atividades são fechadas.

## Estrutura do Projeto

- **MainActivity.java**: Configura a grade de botões e gerencia a navegação para a tela de detalhes.
- **DetailActivity.java**: Exibe a imagem e o texto correspondentes ao botão selecionado.
- **MusicService.java**: Gerencia a reprodução da música de fundo durante o uso do aplicativo.
- **Contador.java**: Mantém o controle do número de atividades ativas para gerenciar o ciclo de vida da música de fundo.

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Faça commit das suas alterações (`git commit -m 'Adiciona nova feature'`).
4. Faça push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

---

# Zulamy25App (English Version)

Zulamy25App is an interactive Android application that presents a grid of 25 numbered buttons. When a button is selected, the user is taken to a details screen displaying an image and text corresponding to the chosen number. The app also plays continuous background music while in use.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Intuitive Interface**: A 5x5 grid of numbered buttons for easy navigation.
- **Details Screen**: Each button leads to a screen with a specific image and text.
- **Background Music**: Continuous music playback while the app is active.

## Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/MarcioCosta013/Zulamy25App.git
   cd Zulamy25App
   ```

2. **Import the Project into Android Studio**:

   - Open Android Studio.
   - Select "Open an existing project" and choose the cloned directory.

3. **Build and Run the Application**:

   - Connect an Android device or use an emulator.
   - Click "Run" to install and launch the application.

## Usage

1. **Main Navigation**:
   - When the app starts, a grid of 25 numbered buttons is displayed.

2. **Interacting with Buttons**:
   - Tap any button to be taken to its corresponding details screen.

3. **Details Screen**:
   - Displays an image and text related to the selected button number.
   - Use the device's "Back" button to return to the main screen.

4. **Background Music**:
   - The music starts automatically when the app opens and stops when all activities are closed.

## Project Structure

- **MainActivity.java**: Sets up the button grid and manages navigation to the details screen.
- **DetailActivity.java**: Displays the image and text for the selected button.
- **MusicService.java**: Manages background music playback while the app is in use.
- **Contador.java**: Keeps track of active activities to handle the background music lifecycle.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a branch for your feature (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Open a Pull Request.

## License

This project is licensed under the [MIT License](LICENSE).
