import pymysql
import pandas as pd
import json

def sql_conn(sql):
    conn = pymysql.connect(host="121.4.26.155", user="root", password="xcy0125", database="ry", charset="utf8"
                           ,port=3306)
    cursor = conn.cursor(cursor=pymysql.cursors.DictCursor)
    cursor.execute(sql)

    res = cursor.fetchall()

    pf = pd.DataFrame(list(res))
    # print(pf)
    cursor.close()
    conn.commit()
    conn.close()
    return res


if __name__ == '__main__':
# get_employeeid = '20221001'

    sql = "SELECT * FROM single_option_question ORDER BY RAND() LIMIT 10"
    data = sql_conn(sql)
    result = ""
    for i in data:
        result+=str(json.dumps(i,ensure_ascii=False))
        result+=";"
    # print(result)
    result = result.replace("\\","")
    result = result[:-1]
    print(result)


