# https://www.hackerrank.com/challenges/library-fine

date_actual = map(int, raw_input().split())
date_expected = map(int, raw_input().split())

if (date_actual[2] < date_expected[2]):
    print 0
    quit()

if (date_actual[2] == date_expected[2] and date_actual[1] < date_expected[1]):
    print 0
    quit()

if (date_actual[2] == date_expected[2] and date_actual[1] == date_expected[1] and date_actual[0] < date_expected[0]):
    print 0
    quit()


if (date_actual[2] > date_expected[2]):
    print 10000
else:
    if (date_actual[1] > date_expected[1]):
        print 500 * (date_actual[1] - date_expected[1])
    else:
        if (date_actual[0] > date_expected[0]):
            print 15 * (date_actual[0] - date_expected[0])
        else:
            print 0
