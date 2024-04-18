//
//  LoadingView.swift
//  iosApp
//
//  Created by Thiago on 18/04/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct LoadingView: View {
    var body: some View {
        VStack {
            ProgressView()
                .progressViewStyle(CircularProgressViewStyle(tint: .white))
                .scaleEffect(2.0, anchor: .center)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .background(Color(.primaryBlack))
    }
}

struct LoadingView_Previews: PreviewProvider {
    static var previews: some View {
        LoadingView()
    }
}
