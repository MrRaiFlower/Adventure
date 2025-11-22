// Coils

crafting.removeByOutput(item('thermalfoundation:material', 513))

crafting.addShaped(item('thermalfoundation:material', 513), [
    [null, ore('dustRedstone'), ore('ingotGold')],
    [ore('dustRedstone'), ore('ingotManasteel'), ore('dustRedstone')],
    [ore('ingotGold'), ore('dustRedstone'), null]
])

crafting.removeByOutput(item('thermalfoundation:material', 514))

crafting.addShaped(item('thermalfoundation:material', 514), [
    [null, ore('dustRedstone'), ore('ingotSilver')],
    [ore('dustRedstone'), ore('ingotManasteel'), ore('dustRedstone')],
    [ore('ingotSilver'), ore('dustRedstone'), null]
])

crafting.removeByOutput(item('thermalfoundation:material', 515))

crafting.addShaped(item('thermalfoundation:material', 515), [
    [null, ore('dustRedstone'), ore('ingotElectrum')],
    [ore('dustRedstone'), ore('ingotManasteel'), ore('dustRedstone')],
    [ore('ingotElectrum'), ore('dustRedstone'), null]
])

// Redstone Servo

crafting.removeByOutput(item('thermalfoundation:material', 512))

crafting.addShaped(item('thermalfoundation:material', 512), [
    [ore('dustRedstone'), ore('ingotManasteel'), ore('dustRedstone')],
    [ore('ingotCopper'), ore('ingotIron'), ore('ingotCopper')],
    [ore('dustRedstone'), ore('ingotManasteel'), ore('dustRedstone')]
])

// Tool Casing

crafting.removeByOutput(item('thermalfoundation:material', 640))

crafting.addShaped(item('thermalfoundation:material', 640), [
    [ore('ingotSteel'), item('thermalfoundation:material', 515), ore('ingotSteel')],
    [ore('plateElectrum'), item('thermalexpansion:cell'), ore('plateElectrum')],
    [ore('ingotSteel'), item('thermalfoundation:material', 515), ore('ingotSteel')]
])

// Drill Head

crafting.removeByOutput(item('thermalfoundation:material', 656))

crafting.addShaped(item('thermalfoundation:material', 656), [
    [null, ore('ingotSteel'), null],
    [ore('ingotSteel'), ore('manaDiamond'), ore('ingotSteel')],
    [ore('ingotManasteel'), ore('ingotSteel'), ore('ingotManasteel')]
])

// Saw Blade

crafting.removeByOutput(item('thermalfoundation:material', 657))

crafting.addShaped(item('thermalfoundation:material', 657), [
    [ore('ingotManasteel'), ore('ingotSteel'), null],
    [ore('ingotSteel'), ore('manaDiamond'), ore('ingotSteel')],
    [null, ore('ingotSteel'), ore('ingotManasteel')]
])

// Frames

crafting.removeByOutput(item('thermalexpansion:frame'))

crafting.addShaped(item('thermalexpansion:frame'), [
    [ore('plateSteel'), item('bloodmagic:blood_shard'), ore('plateSteel')],
    [item('bloodmagic:blood_shard'), ore('gearTin'), item('bloodmagic:blood_shard')],
    [ore('plateSteel'), item('bloodmagic:blood_shard'), ore('plateSteel')]
])

crafting.removeByOutput(item('thermalexpansion:frame', 64))

crafting.addShaped(item('thermalexpansion:frame', 64), [
    [ore('plateTin'), item('botania:managlass'), ore('plateTin')],
    [item('botania:managlass'), ore('gearCopper'), item('botania:managlass')],
    [ore('plateTin'), item('botania:managlass'), ore('plateTin')]
])

crafting.removeByOutput(item('thermalexpansion:frame', 128))

crafting.addShaped(item('thermalexpansion:frame', 128), [
    [ore('plateLead'), item('bloodmagic:item_demon_crystal'), ore('plateLead')],
    [item('bloodmagic:item_demon_crystal'), ore('blockRedstone'), item('bloodmagic:item_demon_crystal')],
    [ore('plateLead'), item('bloodmagic:item_demon_crystal'), ore('plateLead')]
])