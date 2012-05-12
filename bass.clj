(definst bass [note 60]
  (let [freq (midicps note)
        src (+ (sin-osc (* 5 freq))
               (sin-osc (* 4 freq))
               (sin-osc (* 3 freq))
               (square (* 2 freq))
               (sin-osc freq)
               (sin-osc (/ 2 freq))
               (sin-osc (/ 3 freq))
               (sin-osc (/ 4 freq))
               (sin-osc (/ 5 freq)))
        env (env-gen (perc 0.0 1.0) :action PAUSE)]
    (lpf (* 0.9 (* src env)) 900)))
