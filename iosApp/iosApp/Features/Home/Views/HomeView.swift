//
//  HomeView.swift
//  iosApp
//
//  Created by Thiago on 18/04/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct HomeView: View {
    @StateObject var viewModel = HomeViewModel()
    
    var body: some View {
        VStack {
            switch viewModel.state {
            case ComponentState.default_:
                DefaultView(pokemons: viewModel.pokemons)
            case ComponentState.loading:
                LoadingView()
            case ComponentState.error:
                ErrorView()
            default:
                LoadingView()
            }
        }.onAppear{
            Task {
                await viewModel.getPokemons()
            }
        }
    }
}

struct HomeView_Previews: PreviewProvider {
    static var previews: some View {
        HomeView()
    }
}
