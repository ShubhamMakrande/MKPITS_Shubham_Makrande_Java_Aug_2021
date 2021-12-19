MySQL ORDER BY Clause:


>=Syntax:

    SELECT expressions  
    FROM tables  
    [WHERE conditions]  
    ORDER BY expression [ ASC | DESC ];  

>=Execute the following query:

    SELECT *  
    FROM officers  
    WHERE address = 'Lucknow'  
    ORDER BY officer_name;  
