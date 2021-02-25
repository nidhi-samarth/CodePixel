# code_space_of_photographer
%Read the input Image
I=imread('Potter.bmp');       //imread to read an image

BB=step(EyeDetect,I);   //bbox = detector(I,roi) detects objects within 
                                             the rectangular  search region specified by roi. Here roi                     is  Potter  image .                                          

figure(1);
imshow(I); 
rectangle('Position',BB,'LineWidth',8,'LineStyle','-','EdgeColor','c');       //rectangle function 

title('Eyes Detection');    //title of an image
Eyes=imcrop(I,BB);         //imcrop is used to crop  the image
figure(2);
imshow(Eyes);              //imshow is used to display the image 
