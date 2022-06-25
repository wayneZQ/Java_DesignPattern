package DynamicProxy;

/**
 * @ClassName DocumentDAO
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/17 9:54
 **/
public class DocumentDAO implements AbstractDocumentDAO {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if(documentId.equalsIgnoreCase("D001")){
            System.out.println("delete document "+documentId+" success!");
            return true;
        }else{
            System.out.println("delete document "+documentId+" fail!");
            return false;
        }
    }
}
