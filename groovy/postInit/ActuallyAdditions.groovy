// Crafting Table on a Stick

crafting.removeByOutput(item('actuallyadditions:item_crafter_on_a_stick'))

crafting.addShaped(item('actuallyadditions:item_crafter_on_a_stick'), [
    [null, ore('workbench')],
    [ore('stickWood'), null]
])

// Wood Casing

crafting.removeByOutput(item('actuallyadditions:block_misc', 4))

crafting.addShaped(item('actuallyadditions:block_misc', 4), [
    [ore('plankTreatedWood'), ore('stickTreatedWood'), ore('plankTreatedWood')],
    [ore('stickTreatedWood'), null, ore('stickTreatedWood')],
    [ore('plankTreatedWood'), ore('stickTreatedWood'), ore('plankTreatedWood')]
])