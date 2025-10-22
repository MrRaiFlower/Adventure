// Redstone Servo

crafting.removeByOutput(item('thermalfoundation:material', 512))

crafting.addShaped(item('thermalfoundation:material', 512), [
    [ore('ingotIron'), ore('dustRedstone'), ore('ingotIron')],
    [ore('ingotCopper'), ore('stickIron'), ore('ingotCopper')],
    [ore('ingotIron'), ore('dustRedstone'), ore('ingotIron')]
])

// Reception Coil

crafting.removeByOutput(item('thermalfoundation:material', 513))

crafting.addShaped(item('thermalfoundation:material', 513), [
    [null, ore('dustRedstone'), ore('ingotGold')],
    [ore('dustRedstone'), ore('stickIron'), ore('dustRedstone')],
    [ore('ingotGold'), ore('dustRedstone'), null]
])

// Transmission Coil

crafting.removeByOutput(item('thermalfoundation:material', 514))

crafting.addShaped(item('thermalfoundation:material', 514), [
    [null, ore('dustRedstone'), ore('ingotSilver')],
    [ore('dustRedstone'), ore('stickIron'), ore('dustRedstone')],
    [ore('ingotSilver'), ore('dustRedstone'), null]
])

// Conductance Coil

crafting.removeByOutput(item('thermalfoundation:material', 515))

crafting.addShaped(item('thermalfoundation:material', 515), [
    [null, ore('dustRedstone'), ore('ingotElectrum')],
    [ore('dustRedstone'), ore('stickIron'), ore('dustRedstone')],
    [ore('ingotElectrum'), ore('dustRedstone'), null]
])