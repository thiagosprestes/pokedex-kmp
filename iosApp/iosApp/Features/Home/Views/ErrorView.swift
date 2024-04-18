//
//  ErrorView.swift
//  iosApp
//
//  Created by Thiago on 18/04/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct ErrorView: View {
    var body: some View {
        VStack {
            VStack {
                Text("Ocorreu um erro ao obter a lista de pokemóns, tente novamente")
                    .font(.custom("PKMN-RBYGSC", size: 14))
                    .foregroundStyle(.white)
                    .multilineTextAlignment(.center)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            Button(action: {}) {
                Text("Tentar novamente")
                    .font(.custom("PKMN-RBYGSC", size: 14))
                    .foregroundStyle(.white)
            }
            .frame(maxWidth: .infinity)
            .padding(.vertical, 16)
            .background(Color(.primaryRed))
            .cornerRadius(8)
        }
        .padding(24)
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .background(Color(.primaryBlack))
    }
}

struct ErrorView_Previews: PreviewProvider {
    static var previews: some View {
        ErrorView()
    }
}
