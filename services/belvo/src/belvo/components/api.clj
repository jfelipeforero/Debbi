(ns belvo.components.api)
(require '[clj-http.client :as client])

(client/get "https://sandbox.belvo.com/api/accounts/" {:headers {:authorization "Basic MzZlMzNiZGMtNWQ1MS00MmRkLWIwMTItY2Y4ZWQ5YjI4NzcyOjduTTE3bEBNQXAyN21VN0pSMGUxbFhsX3pXMmRGS2lRekdFaWRwLXV5bTdkaUlUSUZpVjF4X28teUItWDhMbzQ="}
                                                       :query-params {:page_size "100"}
                                                       :accept :json})
