//
//  HomeViewModel.swift
//  iosApp
//
//  Created by Thiago on 18/04/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import shared

extension HomeView {
    @MainActor 
    class HomeViewModel: ObservableObject {
        private let getPokemonsUseCase = GetPokemonsUseCase.init()
        
        @Published private(set) var pokemons: [PokemonResponseItem] = []
        @Published var state = ComponentState.loading
        
        func getPokemons() async {
            do {
                let response = try await getPokemonsUseCase.invoke()
                self.pokemons = response
                
                self.state = ComponentState.default_
            } catch {
                print(error.localizedDescription)
                self.state = ComponentState.error
            }
        }
    }
}
