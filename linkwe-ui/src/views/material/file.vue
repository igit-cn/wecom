<script>
import MaPage from '@/views/material/components/MaPage'

export default {
  name: 'File',
  components: { MaPage },
  data() {
    return {
      ids: [], // 选中数组
    }
  },
  watch: {},
  created() {},
  methods: {
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map((item) => item.id)
    },
  },
}
</script>

<template>
  <MaPage ref="page" type="3" :selected="ids" v-slot="{ list }">
    <el-table :data="list" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="50" align="center" />
      <el-table-column
        label="文件名"
        align="center"
        prop="materialName"
        :show-overflow-tooltip="true"
      />
      <el-table-column label="大小" align="center" prop="userName" />

      <el-table-column label="创建时间" align="center" prop="createTime">
      </el-table-column>
      <el-table-column
        label="操作"
        align="center"
        width="180"
        class-name="small-padding fixed-width"
      >
        <template slot-scope="scope">
          <el-button
            type="text"
            @click="$refs.page.download(scope.row)"
            v-hasPermi="['material:download']"
            >下载</el-button
          >
          <el-button
            type="text"
            @click="$refs.page.edit(scope.row)"
            v-hasPermi="['material:edit']"
            >修改</el-button
          >
          <el-button
            type="text"
            @click="$refs.page.remove(scope.row.id)"
            v-hasPermi="['material:remove']"
            >删除</el-button
          >
        </template>
      </el-table-column>
    </el-table>
  </MaPage>
</template>
