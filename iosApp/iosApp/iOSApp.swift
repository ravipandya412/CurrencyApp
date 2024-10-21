import SwiftUI
import ComposeApp

@main
struct iOSApp: App {
    
    init() {
      KoinModuleKt.intializeKoin()
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView().ignoresSafeArea()
        }
    }
}
