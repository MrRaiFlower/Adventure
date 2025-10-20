// Plates Tweak

mods.immersiveengineering.metal_press.removeByMold(item('immersiveengineering:mold'))

def list = [

    ore("ingotIron"),
    ore("ingotGold"),
    ore("ingotCopper"),
    ore("ingotTin"),
    ore("ingotSilver"),
    ore("ingotLead"),
    ore("ingotAluminum"),
    ore("ingotNickel"),
    ore("ingotPlatinum"),
    ore("ingotIridium"),
    ore("ingotMithril"),
    ore("ingotSteel"),
    ore("ingotElectrum"),
    ore("ingotInvar"),
    ore("ingotBronze"),
    ore("ingotConstantant"),
    ore("ingotSignalum"),
    ore("ingotLumium"),
    ore("ingotEnderium")

]

for (int i = 32; i <= 33; i++)
{

    mods.immersiveengineering.metal_press.add(item('thermalfoundation:material', i), list[i - 32], item('immersiveengineering:mold'), 500)

    crafting.addShaped(item('thermalfoundation:material', i), [
    [item('immersiveengineering:tool')],
        [list[i - 32]],
        [list[i - 32]]
    ])

}

for (int i = 320; i <= 328; i++)
{

    mods.immersiveengineering.metal_press.add(item('thermalfoundation:material', i), list[i - 320 + 2], item('immersiveengineering:mold'), 500)

    crafting.addShaped(item('thermalfoundation:material', i), [
    [item('immersiveengineering:tool')],
        [list[i - 320 + 2]],
        [list[i - 320 + 2]]
    ])

}

for (int i = 352; i <= 359; i++)
{

    mods.immersiveengineering.metal_press.add(item('thermalfoundation:material', i), list[i - 352 + 11], item('immersiveengineering:mold'), 500)

    crafting.addShaped(item('thermalfoundation:material', i), [
    [item('immersiveengineering:tool')],
        [list[i - 352 + 11]],
        [list[i - 352 + 11]]
    ])

}

crafting.removeByOutput(item('thaumcraft:plate'))

crafting.removeByOutput(item('thaumcraft:plate', 1))

crafting.removeByOutput(item('thaumcraft:plate', 2))

crafting.removeByOutput(item('thaumcraft:plate', 3))

crafting.addShaped(item('thaumcraft:plate'), [
    [item('immersiveengineering:tool')],
    [ore('ingotBrass')],
    [ore('ingotBrass')]
])

crafting.addShaped(item('thaumcraft:plate', 2), [
    [item('immersiveengineering:tool')],
    [ore('ingotThaumium')],
    [ore('ingotThaumium')]
])

crafting.addShaped(item('thaumcraft:plate', 3), [
    [item('immersiveengineering:tool')],
    [ore('ingotVoid')],
    [ore('ingotVoid')]
])

for (int i = 30; i <= 40; i++)
{

    crafting.removeByOutput(item('immersiveengineering:metal', i))

}