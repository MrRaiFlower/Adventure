// Alloying Tweak

def listA = [

    item('enderio:item_alloy_ingot'),
    item('enderio:item_alloy_ingot', 1),
    item('enderio:item_alloy_ingot', 4),
    item('enderio:item_alloy_ingot', 6),
    item('enderio:item_alloy_ingot', 7),

]

def listB = [

    item('thermalfoundation:material', 160),
    item('thermalfoundation:material', 161),
    item('thermalfoundation:material', 162),
    item('thermalfoundation:material', 163),
    item('thermalfoundation:material', 164),
    item('thermalfoundation:material', 165),
    item('thermalfoundation:material', 166),
    item('thermalfoundation:material', 167)

]

for (item in listA)
{

    mods.thermalexpansion.smelter.removeByOutput(item)

}

mods.enderio.alloy_smelter.remove(item('enderio:item_material', 39))

for (item in listB)
{

    mods.enderio.alloy_smelter.remove(item)

}