package ${package.Controller};


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import ${package.Entity}.${entity};
import ${package.Service}.impl.${table.serviceImplName};
import com.baomidou.mybatisplus.core.metadata.IPage;
<#if restControllerStyle>
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>


import java.util.List;
import java.util.Map;
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
 * <p>
 * ${table.comment!} 前端控制器
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@RequestMapping("<#if package.ModuleName??>/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle??>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

@Autowired
${table.serviceImplName} ${table.serviceImplName?lower_case};

@RequestMapping("queryMapList")
public Map<String,Object> queryMapList(${entity} ${entity?lower_case}){

List<Map<String,Object>> list=${table.serviceImplName?lower_case}.queryMapList(${entity?lower_case});
return getReturnSuccessMap(list);
}

@RequestMapping("queryMapPage")
public Map<String,Object> queryMapPage(Integer pageNumber,Integer pageSize,${entity} ${entity?lower_case}){
IPage<${entity}> page=${table.serviceImplName?lower_case}.queryMapPage(pageNumber,pageSize,${entity?lower_case});
return getReturnSuccessMap(page);
}

@RequestMapping("save")
public Map<String,Object> save(${entity} ${entity?lower_case}){
if(${table.serviceImplName?lower_case}.save(${entity?lower_case})) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
}
}

@RequestMapping("update")
public Map<String,Object> update(${entity} ${entity?lower_case}){
${entity} ${entity?lower_case}1=new ${entity}();
<#list 0..table.fields?size as n>
<#if n==0>
${entity?lower_case}1.set${table.fields[0].capitalName}(${entity?lower_case}.get${table.fields[0].capitalName}());
</#if>
</#list>
if(${table.serviceImplName?lower_case}.updateObject(${entity?lower_case},${entity?lower_case}1)) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
  }
 }

@RequestMapping("delete")
public Map<String,Object> delete(${entity} ${entity?lower_case}){
if(${table.serviceImplName?lower_case}.deleteObject(${entity?lower_case})) {
return getReturnSuccessMap(null);
}else{
return getReturnErrorMap();
}
}
}
</#if>
