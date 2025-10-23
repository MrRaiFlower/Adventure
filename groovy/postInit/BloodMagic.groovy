// Rudimentary Snare

crafting.removeByOutput(item('bloodmagic:soul_snare'))

crafting.addShaped(item('bloodmagic:soul_snare') * 16, [
    [ore('ingotSteel'), ore('string'), ore('gemDiamond')],
    [ore('string'), ore('dustRedstone'), ore('string')],
    [ore('gemDiamond'), ore('string'), ore('ingotSteel')]
])

// Sacrificial Dagger

crafting.removeByOutput(item('bloodmagic:sacrificial_dagger'))

crafting.addShaped(item('bloodmagic:sacrificial_dagger'), [
    [item('tconstruct:clear_glass'), item('tconstruct:clear_glass'), ore('ingotElectrum')],
    [null, ore('ingotDraconium'), item('tconstruct:clear_glass')],
    [ore('ingotCobalt'), null, item('tconstruct:clear_glass')]
])

// Blood Altar

crafting.removeByOutput(item('bloodmagic:altar'))

crafting.addShaped(item('bloodmagic:altar'), [
    [item('tconstruct:slime_congealed', 3), null, item('tconstruct:slime_congealed', 3)],
    [ore('plateSteel'), item('bloodmagic:monster_soul'), ore('plateSteel')],
    [item('appliedenergistics2:sky_stone_brick'), ore('ingotGold'), item('appliedenergistics2:sky_stone_brick')]
])

// Hellfire Forge

crafting.removeByOutput(item('bloodmagic:soul_forge'))

crafting.addShaped(item('bloodmagic:soul_forge'), [
    [ore('plateSilver'), null, ore('plateSilver')],
    [item('appliedenergistics2:sky_stone_brick'), ore('ingotGold'), item('appliedenergistics2:sky_stone_brick')],
    [item('appliedenergistics2:sky_stone_brick'), ore('blockSteel'), item('appliedenergistics2:sky_stone_brick')]
])

// Incense Altar

crafting.removeByOutput(item('bloodmagic:incense_altar'))

crafting.addShaped(item('bloodmagic:incense_altar'), [
    [ore('plateElectrum'), null, ore('plateElectrum')],
    [ore('plateElectrum'), ore('coal'), ore('plateElectrum')],
    [item('appliedenergistics2:sky_stone_brick'), new com.cleanroommc.groovyscript.helper.ingredient.ItemsIngredient(WayofTime.bloodmagic.core.registry.OrbRegistry.getOrbsDownToTier(1)), item('appliedenergistics2:sky_stone_brick')]
])

// Alchemy Table

crafting.removeByOutput(item('bloodmagic:alchemy_table'))

crafting.addShaped(item('bloodmagic:alchemy_table'), [
    [ore('ingotGold'), item('minecraft:carpet', 14), ore('ingotGold')],
    [item('appliedenergistics2:sky_stone_brick'), ore('blockBlaze'), item('appliedenergistics2:sky_stone_brick')],
    [item('appliedenergistics2:sky_stone_brick'), new com.cleanroommc.groovyscript.helper.ingredient.ItemsIngredient(WayofTime.bloodmagic.core.registry.OrbRegistry.getOrbsDownToTier(1)), item('appliedenergistics2:sky_stone_brick')]
])