// Gears Tweak

for(int i = 24; i <= 27; i++) {

    crafting.removeByOutput(item('thermalfoundation:material', i))
    
}

for(int i = 256; i <= 264; i++) {

    crafting.removeByOutput(item('thermalfoundation:material', i))
    
}

for(int i = 288; i <= 295; i++) {

    crafting.removeByOutput(item('thermalfoundation:material', i))
    
}

crafting.removeByOutput(item('thermalfoundation:material', 22))

crafting.addShaped(item('thermalfoundation:material', 22), [
    [null, ore('stickWood'), null],
    [ore('stickWood'), null, ore('stickWood')],
    [null, ore('stickWood'), null]
])

crafting.removeByOutput(item('thermalfoundation:material', 23))

crafting.addShaped(item('thermalfoundation:material', 23), [
    [null, ore('stone'), null],
    [ore('stone'), item('thermalfoundation:material', 22), ore('stone')],
    [null, ore('stone'), null]
])

crafting.addShaped(item('thermalfoundation:material', 23), [
    [ore('stickWood'), ore('stone'), ore('stickWood')],
    [ore('stone'), null, ore('stone')],
    [ore('stickWood'), ore('stone'), ore('stickWood')]
])