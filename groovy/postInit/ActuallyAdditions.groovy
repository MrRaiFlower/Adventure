// Crafting Table on a Stick

crafting.removeByOutput(item('actuallyadditions:item_crafter_on_a_stick'))

crafting.addShaped(item('actuallyadditions:item_crafter_on_a_stick'), [
    [null, ore('workbench')],
    [ore('stickWood'), null]
])