function downloadPDF(){
  this.$axios
      .get('/download', {responseType:'blob'})
      .then(response => {
        const link = document.createElement('a');
        link.href = URL.createObjectURL(response.data);
        //response.data blob type
        link.download = 'test.pdf';
        link.click();
        URL.revokeObjectURL(link.href);
      })
      .catch(error => {
        console.log('fetch : ' + error);
      });
}
      
