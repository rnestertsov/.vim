Vim�UnDo� cr�|ft.![�MR���QT���%�XeY��Q                                      PR�    _�                             ����                                                                                                                                                                                                                                                                                                                                                 V       P�    �                ,	(offset-coords origin (dir-to-offset dir)))�                	[origin dir]�                O	"Take an origin's coords and a direction and return the destination's coords."�                	    :se [1 1]))�                	    :sw [-1 1]�                	    :ne [1 -1]�                	    :nw [-1 -1]�                	    :s  [0 1]�                	    :n  [0 -1]�                	    :e  [1 0]�                	    :w  [-1 0]�   
             
	(case dir�   	             	[dir]�      
          D	"Convert a direction to the offset for moving 1 in that direction."�                	[(+ x dx) (+ y dy)])�                	[[x y] [dx dy]]�                W	"Offset the starting coordinate by the given amount, returning the result coordinate."5�_�                            ����                                                                                                                                                                                                                                                                                                                                                 V       PO�    �                5�_�                           ����                                                                                                                                                                                                                                                                                                                                                 V       PO�     �                 5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       PO�    �                { 5�_�                            ����                                                                                                                                                                                                                                                                                                                                       "          V       PO�     �   !   #          -  (offset-coords origin (dir-to-offset dir)))�       "            [origin dir]�      !          P  "Take an origin's coords and a direction and return the destination's coords."�                 (defn destination-coords�                    :se [1 1]))�                    :sw [-1 1]�                    :ne [1 -1]�                    :nw [-1 -1]�                    :s  [0 1]�                    :n  [0 -1]�                    :e  [1 0]�                    :w  [-1 0]�                  (case dir�                  [dir]�                E  "Convert a direction to the offset for moving 1 in that direction."�                (defn dir-to-offset�                  [(+ x dx) (+ y dy)])�                  [[x y] [dx dy]]�                X  "Offset the starting coordinate by the given amount, returning the result coordinate."�                (defn offset-coords�                 �   
                 :se [1 1]))�   	                 :sw [-1 1]�      
              :ne [1 -1]�      	              :nw [-1 -1]�                    :s  [0 1]�                    :n  [0 -1]�                    :e  [1 0]�                 {:w  [-1 0]5�_�                           ����                                                                                                                                                                                                                                                                                                                                       "          V       PO�     �   
      "         :se [1 1]))5�_�                            ����                                                                                                                                                                                                                                                                                                                                       "          V       PO�    �   !   #          0     (offset-coords origin (dir-to-offset dir)))�       "               [origin dir]�      !          S     "Take an origin's coords and a direction and return the destination's coords."�                    (defn destination-coords�                       :se [1 1]))�                       :sw [-1 1]�                       :ne [1 -1]�                       :nw [-1 -1]�                       :s  [0 1]�                       :n  [0 -1]�                       :e  [1 0]�                       :w  [-1 0]�                     (case dir�                
     [dir]�                H     "Convert a direction to the offset for moving 1 in that direction."�                   (defn dir-to-offset�                     [(+ x dx) (+ y dy)])�                     [[x y] [dx dy]]�                [     "Offset the starting coordinate by the given amount, returning the result coordinate."�                   (defn offset-coords5�_�      	                     ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                  (case dir5�_�      
           	          ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :w  [-1 0]5�_�   	              
          ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :e  [1 0]5�_�   
                        ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :n  [0 -1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :s  [0 1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :nw [-1 -1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :ne [1 -1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :sw [-1 1]5�_�                           ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                    :se [1 1]))5�_�                            ����                                                                                                                                                                                                                                                                                                                                                v       PO�     �                  [dir]    5�_�                       E    ����                                                                                                                                                                                                                                                                                                                                                v       PO�   	 �               E  "Convert a direction to the offset for moving 1 in that direction."5�_�                       -    ����                                                                                                                                                                                                                                                                                                                                                v       PO�    �                 -  (offset-coords origin (dir-to-offset dir)))5�_�                             ����                                                                                                                                                                                                                                                                                                                                                 V       PR�    �                  (ns caves.coords)�                    (defn directions     {:w  [-1 0]      :e  [1 0]      :n  [0 -1]      :s  [0 1]      :nw [-1 -1]      :ne [1 -1]      :sw [-1 1]      :se [1 1]})       (defn offset-coords   X  "Offset the starting coordinate by the given amount, returning the result coordinate."     [[x y] [dx dy]]     [(+ x dx) (+ y dy)])       (defn dir-to-offset   E  "Convert a direction to the offset for moving 1 in that direction."     [dir]     (directions dir))       (defn destination-coords   P  "Take an origin's coords and a direction and return the destination's coords."     [origin dir]   -  (offset-coords origin (dir-to-offset dir)))       (defn neighbors   I  "Return the coordinates of all neighboring squares of the given coord."   
  [origin]   7  (map offset-coord (vals directions) (repeat origin)))5��