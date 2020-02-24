package test.task.handbook;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

@Mapper
public interface HandbookMybatisRepository {

    @Select("SELECT * FROM HANDBOOK")
    List<Handbook> getAll();

    @Select("SELECT * FROM handbook WHERE id = #{id}")
    Handbook findById(long id);

    @Update("Update handbook set name= #{name}, nameShort= #{nameShort} where id=#{id}")
    void updateHandbook(Handbook handbook);

//    @Insert("Insert into handbook (name, nameShort) values (#{name}, #{nameShort})")
//    void insertHandbook(Handbook handbook);
}
