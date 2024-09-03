번역 = ['@', '[', '!', ';', '^', '0', '7', '\\\\\'', '\\\'']
원본 = ['a', 'c', 'i', 'j', 'n', 'o', 't', 'w', 'v']

for i in range(int(input())):
    inputStr = input()
    count=0
    for j in range(9):
        count += inputStr.count(번역[j])
        inputStr = inputStr.replace(번역[j], 원본[j])

    if(len(inputStr)/2 <= count):
        print('I don\'t understand')
    else:
        print(inputStr)