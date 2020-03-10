package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {

@Autowired
${table.mapperName} ${table.mapperName?lower_case};

 public List<Map<String,Object>> queryMapList(${entity} ${entity?lower_case}){

  QueryWrapper<${entity}> wrapper=new QueryWrapper<>();
  <#list table.fields as field>
  if(${entity?lower_case}.get${field.capitalName}()!=null){
  wrapper.eq(true,"${field.name}",${entity?lower_case}.get${field.capitalName}());
  }
  </#list>
  List<Map<String,Object>> map=listMaps(wrapper);
  return map;
 }

public IPage<${entity}> queryMapPage(Integer pageNumber,Integer pageSize,${entity} ${entity?lower_case}){

    QueryWrapper<${entity}> wrapper=new QueryWrapper<>();
    <#list table.fields as field>
     if(${entity?lower_case}.get${field.capitalName}()!=null){
     wrapper.eq(true,"${field.name}",${entity?lower_case}.get${field.capitalName}());
     }
     </#list>
     IPage<${entity}> iPage=new Page<>();
     int total=${table.mapperName?lower_case}.selectCount(wrapper);
     iPage.setTotal(total);
     if(pageNumber!=null&&pageSize!=null) {
     iPage.setCurrent(pageNumber);
     iPage.setSize(pageSize);
     }
    IPage<${entity}> page=page(iPage,wrapper);
    return page;
    }

public Boolean updateObject(${entity} ${entity?lower_case}1,${entity} ${entity?lower_case}2){

UpdateWrapper<${entity}> wrapper=new UpdateWrapper<>();
 <#list table.fields as field>
 if(${entity?lower_case}1.get${field.capitalName}()!=null){
 wrapper.set(true,"${field.name}",${entity?lower_case}1.get${field.capitalName}());
 }
 </#list>
 <#list table.fields as field>
 if(${entity?lower_case}2.get${field.capitalName}()!=null){
 wrapper.eq(true,"${field.name}",${entity?lower_case}2.get${field.capitalName}());
 }
 </#list>
Boolean isUpdate=update(wrapper);
return isUpdate;
}

public Boolean deleteObject(${entity} ${entity?lower_case}){

QueryWrapper<${entity}> wrapper=new QueryWrapper<>();
 <#list table.fields as field>
 if(${entity?lower_case}.get${field.capitalName}()!=null){
 wrapper.eq(true,"${field.name}",${entity?lower_case}.get${field.capitalName}());
 }
 </#list>
 Boolean isDelete=remove(wrapper);
 return isDelete;
}

}
</#if>
