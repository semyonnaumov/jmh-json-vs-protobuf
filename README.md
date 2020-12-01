Десериализация protobuf действительно быстрее, чем json (см. jmh-report.txt):

DeserializationBenchmark.deserializeJson      thrpt    5  1328253,903 ±  167355,157  ops/s
DeserializationBenchmark.deserializeProtobuf  thrpt    5  5374137,835 ± 1529119,855  ops/s