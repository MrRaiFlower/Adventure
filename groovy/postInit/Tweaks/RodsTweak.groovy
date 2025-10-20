// Rods Tweak

def listA = [

    item('immersiveengineering:material', 1),
    item('immersiveengineering:material', 2),
    item('immersiveengineering:material', 3)

]

def listB = [

    ore('ingotIron'),
    ore('ingotSteel'),
    ore('ingotAluminum')

]

for (int i = 0; i <= 2; i++)
{
    crafting.removeByOutput(listA[i])

    crafting.addShaped(listA[i], [
        [listB[i]],
        [listB[i]]
    ])

    mods.immersiveengineering.metal_press.removeByOutput(listA[i])

    mods.immersiveengineering.metal_press.add(listA[i], listB[i], item('immersiveengineering:mold', 2), 1000)
}