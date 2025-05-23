# Link: https://www.hackerrank.com/challenges/validate-list-of-email-address-with-filter/problem?isFullScreen=true
import re
def fun(s):
    # I only edit here
    return re.search("^[_a-z\d-]+@[a-z\d]+\.[a-z]+$",s)
    # until here

def filter_mail(emails):
    return list(filter(fun, emails))

if __name__ == '__main__':
    n = int(input())
    emails = []
    for _ in range(n):
        emails.append(input())

filtered_emails = filter_mail(emails)
filtered_emails.sort()
print(filtered_emails)
