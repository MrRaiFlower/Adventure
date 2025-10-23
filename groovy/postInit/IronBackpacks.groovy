// Basic Backpack

crafting.removeByOutput(item('ironbackpacks:backpack').withNbt(['packInfo': ['type': 'ironbackpacks:basic', 'spec': 'NONE', 'upgrade': []]]))

crafting.addShaped(item('ironbackpacks:backpack').withNbt(['packInfo': ['type': 'ironbackpacks:basic', 'spec': 'NONE', 'upgrade': []]]), [
    [ore('blockWool'), item('adventure:leather_tanned'), ore('blockWool')],
    [item('adventure:leather_tanned'), ore('chestWood'), item('adventure:leather_tanned')],
    [ore('blockWool'), item('adventure:leather_tanned'), ore('blockWool')]
])