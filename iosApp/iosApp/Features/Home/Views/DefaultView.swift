//
//  DefaultView.swift
//  iosApp
//
//  Created by Thiago on 18/04/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct DefaultView: View {
    var pokemons: [PokemonResponseItem] = []
    
    var body: some View {
        let columns: [GridItem] =
        Array(repeating: .init(.flexible()), count: 2)
        
        VStack {
            HStack {
                Text("Pokedex")
                    .font(.custom("PKMN-RBYGSC", size: 14))
                    .foregroundStyle(Color.white)
            }
            .frame(maxWidth: .infinity)
            .padding(.vertical, 20)
            .background(Color(.primaryRed))
            ScrollView(.vertical) {
                LazyVGrid(columns: columns) {
                    ForEach(pokemons, id: \.self.name) { item in
                        VStack {
                            AsyncImage(url: URL(string: "https://img.pokemondb.net/sprites/black-white/normal/\(item.name).png")
                            )
                            .padding(.bottom, 10)
                            Text(item.name)
                                .font(.custom("PKMN-RBYGSC", size: 14))
                                .foregroundStyle(Color.black)
                        }
                        .padding(30)
                        .frame(width: 170, height: 170)
                        .background(Color.white)
                        .clipShape(RoundedRectangle(cornerRadius: 13))
                        .padding(.bottom, 8)
                    }
                }.padding(18)
            }
        }.background(Color(.primaryBlack))
    }
}

struct DefaultView_Previews: PreviewProvider {
    static var previews: some View {
        DefaultView()
    }
}
